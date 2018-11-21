package ru.dvfu.mrcpk.alekseenko.theme12;

import java.lang.reflect.Array;

public class Person<S> {


            // Данные в записной книжке
        private String firstname, lastname, middlename, gender, email, phonenumber, addresses;
        /*Array.List<String> ;

        S = new Array.List<>()*/



        // Пустой конструктор
        Person() {}


        // Конструктор с заданием параметров
        public Person(String firstname, String lastname, String middlename) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.middlename = middlename;

        }

        public String getGender() {
            return gender;
        }

        public String getEmail() {
            return email;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public String getAddresses() {
            return addresses;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public void setAddresses(String addresses) {
            this.addresses = addresses;
        }
        @Override
        public String toString()
        {
            return "Имя: "  + this.firstname + "Фамилия: " + this.lastname + "Очество " + this.middlename;
        }
}

