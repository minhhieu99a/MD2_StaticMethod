package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
	// write your code here
        Student.change();
        Student s1 =new Student(123,"Hoàng");
        Student s2 =new Student(456,"Huy");
        Student s3 =new Student(789,"Hoa");
        s1.display();
        s2.display();
        s3.display();
    }
}
