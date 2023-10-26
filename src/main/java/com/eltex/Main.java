package com.eltex;

public class Main {
    public static void main(String[] args) {
        final var service = new UserService();

        // add использую для заполнения листа т.к. по заданию придется создавать новые элементы с id = 0, а затем их менять
        service.userList.add(0,new User(0,"f","f","f"));
        service.userList.add(1,new User(1,"f","f","f"));
        service.userList.add(2,new User(2,"f","f","f"));
        service.userList.add(3,new User(3,"f","f","f"));
        service.userList.add(4,new User(4,"f","f","f"));

        service.save(service.getUser());
        System.out.println("Лист до изменений");
        service.getAll();
        System.out.println("Поиск по id и последующее удаление");

        service.getById(7);

        service.removeById(3);
        System.out.println("проверка save");
        service.save(new User(2,"g","g","g"));
        service.save(new User(0,"g","g","g"));
        System.out.println("Лист после изменений");
        service.getAll();
    }
}