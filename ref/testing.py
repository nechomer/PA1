__author__ = 'artyom'
import os
import re
import subprocess
import difflib


def remove_files(directory, pattern):
    for f in os.listdir(directory):
        if re.search(pattern, f):
            os.remove(os.path.join(directory, f))


def main():
    if os.path.exists(os.path.join(os.getcwd(), "src/Scanner.java")):
        os.remove(os.path.join(os.getcwd(), "src/Scanner.java"))
    # subprocess.call(["jflex", "--nobak", "-d", "src", "src/jflex_spec.lex"])
    bin_directory = os.path.join(os.getcwd(), "bin")
    if not os.path.exists(bin_directory):
        os.makedirs(bin_directory)
    java_directory = os.path.join(os.getcwd(), "src", "*.java")
    cmd = "javac -d bin " + java_directory
    compile_process = subprocess.Popen(cmd, shell=True)
    compile_process.wait()
    test_output_dir = os.path.join(os.getcwd(), "pa1-myoutput")
    test_input_dir = os.path.join(os.getcwd(), "pa-1-input")
    if not os.path.exists(test_output_dir):
        os.makedirs(test_output_dir)
    remove_files(test_output_dir, "ic.out")
    for f in os.listdir(test_input_dir):
        print "Testing: " + f
        with open(os.path.join(test_output_dir, f), 'w+') as out_file:
            test_out_file = os.path.join(os.getcwd(), "pa-1-output", f.replace(".ic", ".tok"))
            subprocess.call(["java", "-cp", "bin", "Main", os.path.join(test_input_dir, f)], stdout=out_file)
            for line in difflib.context_diff(out_file.readlines(), open(test_out_file).readlines(),
                                             fromfile="Test File", tofile="Our test file"):
                print line

if __name__ == '__main__':
    main()