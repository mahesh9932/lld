package designpatterns.builder;

public class User {
    private final int id;
    private final String name;
    private final String email; //optional
    private final int age; //optional

    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class Builder{
        private final int id;
        private final String name;
        private  String email; //optional
        private  int age; //optional

        public Builder(int id, String name){
            this.id = id;
            this.name = name;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }


}
