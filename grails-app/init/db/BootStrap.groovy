package db

import example.Department
import example.HeadDepartment
import example.Human
import example.Passenger
import example.Town


class BootStrap {

    def init = { servletContext ->

        Human human1 = new Human(
         fullName: "Луговая Мария Петровна", birthday: '1984-11-22',  gender: "жен.", childrenNumber: 1
        ).save()
        Human human2 = new Human(
                fullName: "Петров Виктор Константинович", birthday: '2011-11-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human3 = new Human(
                fullName: "Луговой Николай Петрович", birthday: '1960-01-22',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human4 = new Human(
                fullName: "Кирпичная Надежда Борисовна", birthday: '2021-11-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human5 = new Human(
                fullName: "George George", birthday: '2017-08-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human6 = new Human(
                fullName: "Иванов Иван Иванович", birthday: '2021-11-09',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human7 = new Human(
                fullName: "Березная Маргарита Васильевна", birthday: '2021-11-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human8 = new Human(
                fullName: "Аванов Петр Михайлович", birthday: '1989-06-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human9 = new Human(
                fullName: "Полевая Наталья Алексеевна", birthday: '2021-11-19',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human10 = new Human(
                fullName: "Лесная Анастасия Владимировна", birthday: '1991-05-22',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human11 = new Human(
                fullName: "Петров Михаил Дмитриевич", birthday: '1956-06-22',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human12 = new Human(
                fullName: "Сидоров Владимир Владимирович", birthday: '1973-06-03',  gender: "муж.", childrenNumber: 5
        ).save()
        Human human13 = new Human(
                fullName: "Часовой Геннадий Валерьевич", birthday: '1994-06-08',  gender: "муж.", childrenNumber: 1
        ).save()
        Human human14 = new Human(
                fullName: "Сидорова Дарья Михайловна", birthday: '1980-06-22',  gender: "жен.", childrenNumber: 5
        ).save()
        Human human15 = new Human(
                fullName: "Леонова Кристина Михайловна", birthday: '1982-08-22',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human16 = new Human(
                fullName: "Лавров Николай Петрович", birthday: '1980-08-22',  gender: "муж.", childrenNumber: 1
        ).save()
        Human human17 = new Human(
                fullName: "Иванов Иван Иванович", birthday: '1992-04-07',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human18 = new Human(
                fullName: "Иванов Владимир Владимирович", birthday: '1989-02-06',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human19 = new Human(
                fullName: "Петров Петр Петрович", birthday: '1980-05-15',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human20 = new Human(
                fullName: "Ковалёв Егор Денисович", birthday: '1976-07-07',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human21 = new Human(
                fullName: "Николаев Андрей Андреевич", birthday: '1979-05-01',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human22 = new Human(
                fullName: "Часовая Ксения Дмитриевна", birthday: '1965-01-01',  gender: "жен.", childrenNumber: 1
        ).save()
        Human human23 = new Human(
                fullName: "Соколова Ирина Александровна", birthday: '1980-06-22',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human24 = new Human(
                fullName: "Кузнецова Елена Ивановна", birthday: '1980-06-12',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human25 = new Human(
                fullName: "Попова Лариса Максимовна", birthday: '1991-05-07',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human26 = new Human(
                fullName: "Смирнов Максим Иванович", birthday: '1970-07-23',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human27 = new Human(
                fullName: "Петров Петр Петрович", birthday: '1992-04-07',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human28 = new Human(
                fullName: "Петров Артемий Эдуардович", birthday: '1987-06-08',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human29 = new Human(
                fullName: "Петрова Анастасия Владимировна", birthday: '1960-06-18',  gender: "жен.", childrenNumber: 1
        ).save()
        Human human30 = new Human(
                fullName: "Арбузов Аркадий Вадимович", birthday: '1975-06-05',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human31 = new Human(
                fullName: "Аркадьева Мария Петровна", birthday: '1974-11-22',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human32 = new Human(
                fullName: "Викторов Виктор Константинович", birthday: '1989-12-22',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human33 = new Human(
                fullName: "Викторова Елена Петровна", birthday: '1990-01-22',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human34 = new Human(
                fullName: "Семенова Надежда Борисовна", birthday: '1970-11-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human35 = new Human(
                fullName: "Субботин Григорий Кириллович", birthday: '1997-08-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human36 = new Human(
                fullName: "Сидорова Ксения Данииловна", birthday: '1980-11-29',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human37 = new Human(
                fullName: "Маркова Алиса Егоровна", birthday: '1978-01-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human38 = new Human(
                fullName: "Десина Анастасия Тимуровна", birthday: '1999-06-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human39 = new Human(
                fullName: "Васильев Данил Артемович", birthday: '1989-12-19',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human40 = new Human(
                fullName: "Никулин Иван Богданович", birthday: '1981-05-22',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human41 = new Human(
                fullName: "Булгаков Иван Иванович", birthday: '1986-06-22',  gender: "муж.", childrenNumber: 4
        ).save()
        Human human42 = new Human(
                fullName: "Панкова Ярослава Егоровна", birthday: '1983-06-03',  gender: "жен.", childrenNumber: 5
        ).save()
        Human human43 = new Human(
                fullName: "Сальников Матвей Вячеславович", birthday: '1992-06-08',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human44 = new Human(
                fullName: "Соколова Софья Дмитриевна", birthday: '1990-06-22',  gender: "жен.", childrenNumber: 5
        ).save()
        Human human45 = new Human(
                fullName: "Гончарова ирина Марковна", birthday: '1981-04-21',  gender: "жен.", childrenNumber: 2
        ).save()
        Human human46 = new Human(
                fullName: "Смирнов Егор Николаевич", birthday: '1970-08-22',  gender: "муж.", childrenNumber: 1
        ).save()
        Human human47 = new Human(
                fullName: "Гусев Матвей Константинович", birthday: '1991-04-02',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human48 = new Human(
                fullName: "Булатова Алиса Владимировна", birthday: '1974-11-22',  gender: "жен.", childrenNumber: 1
        ).save()
        Human human49 = new Human(
                fullName: "Кузин Владислав Тимофеевич", birthday: '1961-11-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human50 = new Human(
                fullName: "Кузьмин Михаил Тимурович", birthday: '1980-01-22',  gender: "муж.", childrenNumber: 2
        ).save()
        Human human51 = new Human(
                fullName: "Андрианова Анна Артемовна", birthday: '1967-11-22',  gender: "жен.", childrenNumber: 0
        ).save()
        Human human52 = new Human(
                fullName: "Матвеев Ермила Даниилович", birthday: '1985-08-22',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human53 = new Human(
                fullName: "Ульянов Арсений Богданович", birthday: '1984-11-09',  gender: "муж.", childrenNumber: 0
        ).save()
        Human human54 = new Human(
                fullName: "Гаврилова Варвара Михайловна", birthday: '1968-11-22',  gender: "жен.", childrenNumber: 0
        ).save()


       Passenger passenger1 =  new Passenger(human: human1).save()
       Passenger passenger2 =  new Passenger(human: human2).save()
       Passenger passenger3 =  new Passenger(human: human3).save()
       Passenger passenger4 =  new Passenger(human: human4).save()
       Passenger passenger5 =  new Passenger(human: human5).save()
       Passenger passenger6 =  new Passenger(human: human6).save()
       Passenger passenger7 =  new Passenger(human: human7).save()
       Passenger passenger8 =  new Passenger(human: human8).save()
       Passenger passenger9 =  new Passenger(human: human9).save()
       Passenger passenger10 =  new Passenger(human: human10).save()

        HeadDepartment headDepartment1 = new HeadDepartment(human:human34).save()
        HeadDepartment headDepartment2 = new HeadDepartment(human:human35).save()
        HeadDepartment headDepartment3 = new HeadDepartment(human:human36).save()
        HeadDepartment headDepartment4 = new HeadDepartment(human:human37).save()
        HeadDepartment headDepartment5 = new HeadDepartment(human:human38).save()
        HeadDepartment headDepartment6 = new HeadDepartment(human:human39).save()
        HeadDepartment headDepartment7 = new HeadDepartment(human:human40).save()

        Town town1 = new Town(name: "Екатеринбург", distance: 150).save()
        Town town2 = new Town(name:"Москва", distance:340).save()
        Town town3 = new Town(name:"Мюнхен",distance: 501).save()
        Town town4 = new Town(name:"Алматы", distance:79).save()
        Town town5 = new Town(name:"Красноярск", distance:5).save()

        Department department1 = new Department(name:  "служба летная", headDepartment: headDepartment1).save()
        Department department2 = new Department(name:  "служба летная", headDepartment: headDepartment2).save()
        Department department3 = new Department(name:  "служба летная", headDepartment: headDepartment3).save()
        Department department4 = new Department(name:  "служба летная", headDepartment: headDepartment4).save()
        Department department5 = new Department(name:  "служба летная", headDepartment: headDepartment5).save()
        Department department6 = new Department(name:  "служба летная", headDepartment: headDepartment6).save()
        Department department7 = new Department(name:  "служба летная", headDepartment: headDepartment7).save()



    }



    def destroy = {
    }
}
