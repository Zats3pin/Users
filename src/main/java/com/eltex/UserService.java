package com.eltex;
import java.util.ArrayList;
public class UserService {
int temp;




    private User user = new User.Builder().build();
    ArrayList<User> userList = new ArrayList<>();

    public void save(final User user){

        if (user.getId() == 0) {
            userList.add(user); // по заданию новые юзеры создаются только при id == 0;
        }
        else {
            if (getByIdx(user.getId()) == -1){
                //вызываю эксепшен

            }
            else{
                changeById(user.getId(), user);
            }


        }

    }

    public void getById(int id) throws NotFoundException {

            System.out.println(userList.get(getByIdx(id)));

    }


    public int getByIdx(int id) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).id == id) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void removeById(int id){
        userList.remove(getByIdx(id));
    }


    public void changeById(int index, User user){

          userList.remove(index);
          userList.add(index, user);


    }

    public void getAll() {
        for(int i = 0;i < userList.size();i++) {
            System.out.println(userList.get(i));
        }
    }


    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void setId(final int id){
        user = user.builder()
                .setId(id)
                .build();
    }


    public void setLogin(final String login){
        user = user.builder()
                .setLogin(login)
                .build();
    }

    public void setName(final String name){
        user = user.builder()
                .setName(name)
                .build();
    }

    public void setAvatar(final String avatar){
        user = user.builder()
                .setAvatar(avatar)
                .build();
    }



    public User getUser(){
        return user;
    }

    public int getId(){
        return user.getId();
    }




}

