package com.zhengyu.lambda.stream;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class Person {
    private String name;
    private int age;
    private double salary;
    private String sex;
    private String locationCity;
    private String companyName;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        salary = builder.salary;
        sex = builder.sex;
        locationCity = builder.locationCity;
        companyName = builder.companyName;
    }


    public static final class Builder {
        private String name;
        private int age;
        private double salary;
        private String sex;
        private String locationCity;
        private String companyName;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder salary(double val) {
            salary = val;
            return this;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder locationCity(String val) {
            locationCity = val;
            return this;
        }

        public Builder companyName(String val) {
            companyName = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public String getCompanyName() {
        return companyName;
    }
}
