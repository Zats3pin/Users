package com.eltex;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final var service = new UserService();

        // add использую для заполнения листа т.к. по заданию придется создавать новые элементы с id = 0, а затем их менять
        service.userList.add(0,new User(0,"f","f","f"));
        service.userList.add(1,new User(1,"f","f","f"));
        service.userList.add(2,new User(2,"f","f","f"));
        service.userList.add(3,new User(3,"f","f","f"));
        service.userList.add(4,new User(4,"f","f","f"));

        Scanner in = new Scanner(System.in);
       int temp = 0;

        
        int tempId = 0;
        String tempLogin;
        String tempName;
        String tempAvatar;

        
        while (temp != 4) {
            System.out.println("Меню\n 0 - добавить объект\n 1 - найти по ID\n 2 - удалить по ID\n 3 - вывести все объекты\n 4 - выход\n");
            temp = Integer.parseInt(in.nextLine());
            switch (temp) {
                case 0:
                    System.out.println("Введите ID");
                    tempId = Integer.parseInt(in.nextLine());
                    System.out.println("Введите Login");
                    tempLogin = in.nextLine();
                    System.out.println("Введите Name");
                    tempName = in.nextLine();
                    System.out.println("Введите Avatar, если аватар не нужен введите 0");
                    tempAvatar = in.nextLine();
                    if (tempAvatar.equals("0")){
                    service.save(new User(tempId, tempLogin, tempName, null));}
                    else {service.save(new User(tempId, tempLogin, tempName, tempAvatar));}
                    break;
                case 1:
                    System.out.println("Введите ID");
                    tempId = Integer.parseInt(in.nextLine());
                    service.getById(tempId);
                    break;
                case 2:
                    System.out.println("Введите ID");
                    tempId = Integer.parseInt(in.nextLine());
                    service.removeById(tempId);
                    break;
                case 3:
                    service.getAll();
                    break;
            }
        }
       //тесты
       /* service.save(service.getUser());
        System.out.println("Лист до изменений");
        service.getAll();
        System.out.println("Поиск по id и последующее удаление");
        service.getById(7);
        service.removeById(3);
        System.out.println("проверка save");
        service.save(new User(2,"g","g","g"));
        service.save(new User(0,"g","g","g"));
        System.out.println("Лист после изменений");
        service.getAll();*/
    }
}