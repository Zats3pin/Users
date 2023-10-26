package com.eltex;


public class User {
    int id;
    String login;
    String name;
    String avatar;

    public User(int id, String login, String name, String avatar) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.avatar = avatar;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString()
    {
        return  this.id + " - ID \n " +
                this.login + " - LOGIN \n " +
                this.name + " - USERNAME \n " +
                this.avatar + " - AVATAR \n ";


    }


    public Builder builder(){
        return new Builder()

                .setId(id)
                .setLogin(login)
                .setName(name)
                .setAvatar(avatar)
                ;
    }


    static class Builder {
        
        private int id = 12;
        private String login = "";
        private String name = "";
        private String avatar = "";
        

        // Каждый метод строителя запоминает данные и возвращает сам себя
        
        public Builder setId( int id) {
            this.id = id;
            return this;
        }

        public Builder setLogin( String login) {
            this.login = login;
            return this;
        }

        public Builder setName( String name) {
            this.name = name;
            return this;
        }

        public Builder setAvatar( String avatar) {
            this.avatar = avatar;
            return this;
        }

        // В финале вызываем build, чтобы получить результат
        public User build() {
            return new User(id, login, name, avatar);
        }

    }

}
