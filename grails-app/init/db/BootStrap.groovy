
package db


class BootStrap {

    def init = { servletContext ->

        /*
        Gender male = new Gender(name : "мужской")
        Gender female = new Gender(name : "женский")

        // people

        Human human1 = new Human(
                fullName: "Луговая Мария Петровна", birthday: '1984-11-22',  gender: female, childrenNumber: 1
        ).save()

        Human human2 = new Human(
                fullName: "Петров Виктор Константинович", birthday: '2011-11-22',  gender: male, childrenNumber: 0
        ).save()
        Human human3 = new Human(
                fullName: "Луговой Николай Петрович", birthday: '1960-01-22',  gender: male, childrenNumber: 2
        ).save()
        Human human4 = new Human(
                fullName: "Кирпичная Надежда Борисовна", birthday: '2021-11-22',  gender: female, childrenNumber: 0
        ).save()
        Human human5 = new Human(
                fullName: "George George", birthday: '2017-08-22',  gender: male, childrenNumber: 0
        ).save()
        Human human6 = new Human(
                fullName: "Иванов Иван Иванович", birthday: '2021-11-09',  gender: male, childrenNumber: 0
        ).save()
        Human human7 = new Human(
                fullName: "Березная Маргарита Васильевна", birthday: '2021-11-22',  gender: female, childrenNumber: 0
        ).save()
        Human human8 = new Human(
                fullName: "Аванов Петр Михайлович", birthday: '1989-06-22',  gender: male, childrenNumber: 0
        ).save()
        Human human9 = new Human(
                fullName: "Полевая Наталья Алексеевна", birthday: '2021-11-19',  gender: female, childrenNumber: 0
        ).save()
        Human human10 = new Human(
                fullName: "Лесная Анастасия Владимировна", birthday: '1991-05-22',  gender: female, childrenNumber: 2
        ).save()
        Human human11 = new Human(
                fullName: "Петров Михаил Дмитриевич", birthday: '1956-06-22',  gender: male, childrenNumber: 2
        ).save()
        Human human12 = new Human(
                fullName: "Сидоров Владимир Владимирович", birthday: '1973-06-03',  gender: male, childrenNumber: 5
        ).save()
        Human human13 = new Human(
                fullName: "Часовой Геннадий Валерьевич", birthday: '1994-06-08',  gender: male, childrenNumber: 1
        ).save()
        Human human14 = new Human(
                fullName: "Сидорова Дарья Михайловна", birthday: '1980-06-22',  gender: female, childrenNumber: 5
        ).save()
        Human human15 = new Human(
                fullName: "Леонова Кристина Михайловна", birthday: '1982-08-22',  gender: female, childrenNumber: 2
        ).save()
        Human human16 = new Human(
                fullName: "Лавров Николай Петрович", birthday: '1980-08-22',  gender: male, childrenNumber: 1
        ).save()
        Human human17 = new Human(
                fullName: "Иванов Иван Иванович", birthday: '1992-04-07',  gender: male, childrenNumber: 0
        ).save()
        Human human18 = new Human(
                fullName: "Иванов Владимир Владимирович", birthday: '1989-02-06',  gender: male, childrenNumber: 0
        ).save()
        Human human19 = new Human(
                fullName: "Петров Петр Петрович", birthday: '1980-05-15',  gender: male, childrenNumber: 2
        ).save()
        Human human20 = new Human(
                fullName: "Ковалёв Егор Денисович", birthday: '1976-07-07',  gender: male, childrenNumber: 2
        ).save()
        Human human21 = new Human(
                fullName: "Николаев Андрей Андреевич", birthday: '1979-05-01',  gender: male, childrenNumber: 2
        ).save()
        Human human22 = new Human(
                fullName: "Часовая Ксения Дмитриевна", birthday: '1965-01-01',  gender: female, childrenNumber: 1
        ).save()
        Human human23 = new Human(
                fullName: "Соколова Ирина Александровна", birthday: '1980-06-22',  gender: female, childrenNumber: 2
        ).save()
        Human human24 = new Human(
                fullName: "Кузнецова Елена Ивановна", birthday: '1980-06-12',  gender: female, childrenNumber: 2
        ).save()
        Human human25 = new Human(
                fullName: "Попова Лариса Максимовна", birthday: '1991-05-07',  gender: female, childrenNumber: 2
        ).save()
        Human human26 = new Human(
                fullName: "Смирнов Максим Иванович", birthday: '1970-07-23',  gender: male, childrenNumber: 0
        ).save()
        Human human27 = new Human(
                fullName: "Петров Петр Петрович", birthday: '1992-04-07',  gender: male, childrenNumber: 0
        ).save()
        Human human28 = new Human(
                fullName: "Петров Артемий Эдуардович", birthday: '1987-06-08',  gender: male, childrenNumber: 0
        ).save()
        Human human29 = new Human(
                fullName: "Петрова Анастасия Владимировна", birthday: '1960-06-18',  gender: female, childrenNumber: 1
        ).save()
        Human human30 = new Human(
                fullName: "Арбузов Аркадий Вадимович", birthday: '1975-06-05',  gender: male, childrenNumber: 2
        ).save()
        Human human31 = new Human(
                fullName: "Аркадьева Мария Петровна", birthday: '1974-11-22',  gender: female, childrenNumber: 2
        ).save()
        Human human32 = new Human(
                fullName: "Викторов Виктор Константинович", birthday: '1989-12-22',  gender: male, childrenNumber: 2
        ).save()
        Human human33 = new Human(
                fullName: "Викторова Елена Петровна", birthday: '1990-01-22',  gender: female, childrenNumber: 2
        ).save()
        /*
        Human human34 = new Human(
                fullName: "Семенова Надежда Борисовна", birthday: '1970-11-22',  gender: female, childrenNumber: 0
        ).save()
        Human human35 = new Human(
                fullName: "Субботин Григорий Кириллович", birthday: '1997-08-22',  gender: male, childrenNumber: 0
        ).save()
        Human human36 = new Human(
                fullName: "Сидорова Ксения Данииловна", birthday: '1980-11-29',  gender: female, childrenNumber: 0
        ).save()
        Human human37 = new Human(
                fullName: "Маркова Алиса Егоровна", birthday: '1978-01-22',  gender: female, childrenNumber: 0
        ).save()
        Human human38 = new Human(
                fullName: "Десина Анастасия Тимуровна", birthday: '1999-06-22',  gender: female, childrenNumber: 0
        ).save()
        Human human39 = new Human(
                fullName: "Васильев Данил Артемович", birthday: '1989-12-19',  gender: male, childrenNumber: 2
        ).save()
        Human human40 = new Human(
                fullName: "Никулин Иван Богданович", birthday: '1981-05-22',  gender: male, childrenNumber: 2
        ).save()
        Human human41 = new Human(
                fullName: "Булгаков Иван Иванович", birthday: '1986-06-22',  gender: male, childrenNumber: 4
        ).save()
        Human human42 = new Human(
                fullName: "Панкова Ярослава Егоровна", birthday: '1983-06-03',  gender: female, childrenNumber: 5
        ).save()
        Human human43 = new Human(
                fullName: "Сальников Матвей Вячеславович", birthday: '1992-06-08',  gender: male, childrenNumber: 2
        ).save()
        Human human44 = new Human(
                fullName: "Соколова Софья Дмитриевна", birthday: '1990-06-22',  gender: female, childrenNumber: 5
        ).save()
        Human human45 = new Human(
                fullName: "Гончарова ирина Марковна", birthday: '1981-04-21',  gender: female, childrenNumber: 2
        ).save()
        Human human46 = new Human(
                fullName: "Смирнов Егор Николаевич", birthday: '1970-08-22',  gender: male, childrenNumber: 1
        ).save()
        Human human47 = new Human(
                fullName: "Гусев Матвей Константинович", birthday: '1991-04-02',  gender: male, childrenNumber: 0
        ).save()
        Human human48 = new Human(
                fullName: "Булатова Алиса Владимировна", birthday: '1974-11-22',  gender: female, childrenNumber: 1
        ).save()
        Human human49 = new Human(
                fullName: "Кузин Владислав Тимофеевич", birthday: '1961-11-22',  gender: male, childrenNumber: 0
        ).save()
        Human human50 = new Human(
                fullName: "Кузьмин Михаил Тимурович", birthday: '1980-01-22',  gender: male, childrenNumber: 2
        ).save()
        Human human51 = new Human(
                fullName: "Андрианова Анна Артемовна", birthday: '1967-11-22',  gender: female, childrenNumber: 0
        ).save()
        Human human52 = new Human(
                fullName: "Матвеев Ермила Даниилович", birthday: '1985-08-22',  gender: male, childrenNumber: 0
        ).save()
        Human human53 = new Human(
                fullName: "Ульянов Арсений Богданович", birthday: '1984-11-09',  gender: male, childrenNumber: 0
        ).save()
        Human human54 = new Human(
                fullName: "Гаврилова Варвара Михайловна", birthday: '1968-11-22',  gender: female, childrenNumber: 0
        ).save()

        Human human55 = new Human(
                fullName: "Уварова Мария Петровна", birthday: '1984-10-22',  gender: female, childrenNumber: 1
        ).save()

         */
/*
        // passengers
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



        //towns
        Town town1 = new Town(name: "Екатеринбург", distance: 150).save()
        Town town2 = new Town(name:"Москва", distance:340).save()
        Town town3 = new Town(name:"Мюнхен",distance: 501).save()
        Town town4 = new Town(name:"Алматы", distance:79).save()
        Town town5 = new Town(name:"Красноярск", distance:5).save()

        // head-departments
        HeadDepartment headDepartment1 = new HeadDepartment(human:human11).save()
        HeadDepartment headDepartment2 = new HeadDepartment(human:human16).save()
        HeadDepartment headDepartment3 = new HeadDepartment(human:human21).save()
        HeadDepartment headDepartment4 = new HeadDepartment(human:human26).save()
        HeadDepartment headDepartment5 = new HeadDepartment(human:human28).save()
        HeadDepartment headDepartment6 = new HeadDepartment(human:human30).save()
        HeadDepartment headDepartment7 = new HeadDepartment(human:human32).save()

        //departments
        Department department1 = new Department(name:  "служба летная", headDepartment: headDepartment1).save()
        Department department2 = new Department(name:  "служба техническая", headDepartment: headDepartment2).save()
        Department department3 = new Department(name:  "служба обслуживающая", headDepartment: headDepartment3).save()
        Department department4 = new Department(name:  "служба диспетчерская", headDepartment: headDepartment4).save()
        Department department5 = new Department(name:  "служба кассового обслуживания", headDepartment: headDepartment5).save()
        Department department6 = new Department(name:  "служба безопасности", headDepartment: headDepartment6).save()
        Department department7 = new Department(name:  "служба справочная", headDepartment: headDepartment7).save()

        // brigades
        Brigade brigade1 = new Brigade(name: "pilot-1", department: department1).save()
        Brigade brigade2 = new Brigade(name: "pilot-2", department: department1).save()
        Brigade brigade3 = new Brigade(name: "pilot-3", department: department1).save()
        Brigade brigade4 = new Brigade(name: "pilot-4", department: department1).save()
        Brigade brigade5 = new Brigade(name: "pilot-5", department: department1).save()
        Brigade brigade6 = new Brigade(name: "tech-1", department: department2).save()
        Brigade brigade7 = new Brigade(name: "tech-2", department: department2).save()
        Brigade brigade8 = new Brigade(name: "tech-3", department: department2).save()
        Brigade brigade9 = new Brigade(name: "tech-4", department: department2).save()
        Brigade brigade10 = new Brigade(name: "tech-5", department: department2).save()
        Brigade brigade11 = new Brigade(name: "serving-1", department: department3).save()
        Brigade brigade12 = new Brigade(name: "serving-2", department: department3).save()
        Brigade brigade13 = new Brigade(name: "serving-3", department: department3).save()
        Brigade brigade14 = new Brigade(name: "serving-4", department: department3).save()
        Brigade brigade15 = new Brigade(name: "serving-5", department: department3).save()
        Brigade brigade16 = new Brigade(name: "dispatcher-1", department: department4).save()
        Brigade brigade17 = new Brigade(name: "dispatcher-2", department: department4).save()
        Brigade brigade18 = new Brigade(name: "cash-1", department: department5).save()
        Brigade brigade19 = new Brigade(name: "cash-2", department: department5).save()
        Brigade brigade20 = new Brigade(name: "secure-1", department: department6).save()
        Brigade brigade21 = new Brigade(name: "secure-2", department: department6).save()
        Brigade brigade22 = new Brigade(name: "help-1", department: department7).save()
        Brigade brigade23 = new Brigade(name: "help-2", department: department7).save()



        // plane type
        PlaneType planetype1 = new PlaneType(name: "Airbus A920", capacity: 10, speed: 500).save()
        PlaneType planetype2 = new PlaneType(name: "Airbus A640", capacity: 9, speed: 500).save()
        PlaneType planetype3 = new PlaneType(name: "Boeing-b17", capacity: 8, speed: 900).save()
        PlaneType planetype4 = new PlaneType(name: "Airbus A320", capacity: 10, speed: 800).save()
        PlaneType planetype5 = new PlaneType(name: "ИЛ-96", capacity: 9, speed: 400).save()

        // plane
        Plane plane1 = new Plane(typeId: planetype1, technicalBrigade: brigade6, pilotBrigade: brigade1, serviceBrigade: brigade11,startUsingDate: '2003-06-05').save()
        Plane plane2 = new Plane(typeId: planetype2, technicalBrigade: brigade7, pilotBrigade: brigade2, serviceBrigade: brigade12,startUsingDate: '2009-09-05').save()
        Plane plane3 = new Plane(typeId: planetype3, technicalBrigade: brigade8, pilotBrigade: brigade3, serviceBrigade: brigade13,startUsingDate: '2008-12-03').save()
        Plane plane4 = new Plane(typeId: planetype4, technicalBrigade: brigade9, pilotBrigade: brigade4, serviceBrigade: brigade14,startUsingDate: '2006-03-05').save()
        Plane plane5 = new Plane(typeId: planetype5, technicalBrigade: brigade10, pilotBrigade: brigade5, serviceBrigade: brigade15,startUsingDate: '2001-11-22').save()

        // flight
        Flight flight1 = new Flight(type: 'ОТПРАВЛЕНИЕ', planeId : plane1, townId: town1, flightTime :'2012-01-14 01:42:45',isCancelled: false, isDepartureAbroad :false).save()
        Flight flight2 = new Flight(type: 'ПРИБЫТИЕ', planeId:  plane1, townId:  town4,flightTime:  '2012-01-16 05:02:43', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight3 = new Flight(type :'ОТПРАВЛЕНИЕ', planeId:  plane2, townId:  town1, flightTime:  '2012-01-21 03:58:05', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight4 = new Flight(type : 'ПРИБЫТИЕ', planeId:  plane2, townId:  town5, flightTime:  '2012-01-23 16:08:10', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight5 = new Flight(type :'ОТПРАВЛЕНИЕ', planeId:  plane3, townId:  town5, flightTime:  '2012-01-26 16:16:00', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight6 = new Flight(type: 'ОТПРАВЛЕНИЕ', planeId:  plane4, townId:  town2, flightTime:  '2012-01-21 03:58:00', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight7 = new Flight(type:  'ПРИБЫТИЕ', planeId:  plane3 , townId:  town2, flightTime:  '2012-01-26 20:00:00', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight8 = new Flight(type:  'ПРИБЫТИЕ', planeId:  plane4, townId:  town3, flightTime:  '2012-01-23 16:08:00', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight9 = new Flight(type:  'ОТПРАВЛЕНИЕ', planeId:  plane5, townId:  town1, flightTime:  '2012-05-06 16:10:25', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight10 = new Flight(type:  'ПРИБЫТИЕ', planeId:  plane5, townId:  town5, flightTime:  '2012-05-06 23:08:00', isCancelled:  false, isDepartureAbroad:  false).save()
        Flight flight11 = new Flight(type:  'ОТПРАВЛЕНИЕ', planeId:  plane5, townId:  town3, flightTime:  '2012-05-07 10:10:20', isCancelled:  false, isDepartureAbroad:  true).save()
        Flight flight12 = new Flight(type:  'ОТПРАВЛЕНИЕ', planeId:  plane3, townId:  town3, flightTime:  '2012-01-27 22:00:00', isCancelled:  true, isDepartureAbroad:  false).save()




        // flight delay
        FlightDelay delay1 = new FlightDelay(flightId : flight12, delayReason : 'поломка самолета').save()

        // employee

        Employee employee1 = new Employee(humanId : human11, brigadeId : brigade1, startWorkExperience:  '2010-02-03', salary : 250000).save()
        Employee employee2 = new Employee(humanId:  human12, brigadeId:  brigade2, startWorkExperience:  '2013-06-04', salary:  180000).save()
        Employee employee3 = new Employee(humanId:  human13, brigadeId:  brigade3, startWorkExperience:  '2011-02-02', salary:  200000).save()
        Employee employee4 = new Employee(humanId:  human14, brigadeId:  brigade4, startWorkExperience:  '2018-04-05', salary:  210010).save()
        Employee employee5 = new Employee(humanId:  human15, brigadeId:  brigade5, startWorkExperience:  '2010-04-24', salary:  150000).save()
        Employee employee6 = new Employee(humanId:  human16, brigadeId:  brigade6, startWorkExperience:  '2016-02-01', salary:  100000).save()
        Employee employee7 = new Employee(humanId:  human17, brigadeId:  brigade7, startWorkExperience:  '2018-02-16', salary:  101000).save()
        Employee employee8 = new Employee(humanId:  human18, brigadeId:  brigade8, startWorkExperience:  '2015-10-12', salary:  120000).save()
        Employee employee9 = new Employee(humanId:  human19, brigadeId:  brigade9, startWorkExperience:  '2012-05-07', salary:  140500).save()
        Employee employee10 = new Employee(humanId:  human20, brigadeId:  brigade10, startWorkExperience:  '2017-05-01', salary:  80000).save()
        Employee employee11 = new Employee(humanId:  human21, brigadeId:  brigade11, startWorkExperience:  '2017-06-19', salary:  30000).save()
        Employee employee12 = new Employee(humanId:  human22, brigadeId:  brigade12, startWorkExperience:  '2013-06-20', salary:  35000).save()
        Employee employee13 = new Employee(humanId:  human23, brigadeId:  brigade13, startWorkExperience:  '2011-05-12', salary:  35500).save()
        Employee employee14 = new Employee(humanId:  human24, brigadeId:  brigade14, startWorkExperience:  '2018-03-03', salary:  36000).save()
        Employee employee15 = new Employee(humanId:  human25, brigadeId:  brigade15, startWorkExperience:  '2010-02-14', salary:  48000).save()
        Employee employee16 = new Employee(humanId:  human26, brigadeId:  brigade16, startWorkExperience:  '2018-02-01', salary:  90000).save()
        Employee employee17 = new Employee(humanId:  human27, brigadeId:  brigade17, startWorkExperience:  '2018-02-28', salary:  98000).save()
        Employee employee18 = new Employee(humanId:  human28, brigadeId:  brigade18, startWorkExperience:  '2014-10-12', salary:  35000).save()
        Employee employee19 = new Employee(humanId:  human29, brigadeId:  brigade19, startWorkExperience:  '2012-05-21', salary:  36000).save()
        Employee employee20 = new Employee(humanId:  human30, brigadeId:  brigade20, startWorkExperience:  '2017-07-01', salary:  23000).save()
        Employee employee21 = new Employee(humanId:  human31, brigadeId:  brigade21, startWorkExperience:  '2019-10-12', salary:  24000).save()
        Employee employee22 = new Employee(humanId:  human32, brigadeId:  brigade22, startWorkExperience:  '2021-05-07', salary:  15000).save()
        Employee employee23 = new Employee(humanId:  human33, brigadeId:  brigade23, startWorkExperience:  '2020-07-01', salary:  18000).save()


        /*
        Employee employee25 = new Employee(humanId:  human34, brigadeId:  brigade25, startWorkExperience:  '2011-02-14', salary:  48000).save()
        Employee employee26 = new Employee(humanId:  human35, brigadeId:  brigade26, startWorkExperience:  '2019-02-01', salary:  90000).save()
        Employee employee27 = new Employee(humanId:  human36, brigadeId:  brigade27, startWorkExperience:  '2018-02-28', salary:  98000).save()
        Employee employee28 = new Employee(humanId:  human37, brigadeId:  brigade28, startWorkExperience:  '2012-10-12', salary:  35000).save()
        Employee employee29 = new Employee(humanId:  human38, brigadeId:  brigade29, startWorkExperience:  '2011-05-21', salary:  36000).save()
        Employee employee30 = new Employee(humanId:  human39, brigadeId:  brigade30, startWorkExperience:  '2016-07-01', salary:  23000).save()
        Employee employee31 = new Employee(humanId:  human40, brigadeId:  brigade31, startWorkExperience:  '2018-10-12', salary:  24000).save()
        Employee employee32 = new Employee(humanId:  human41, brigadeId:  brigade32, startWorkExperience:  '2020-05-07', salary:  15000).save()
        Employee employee33 = new Employee(humanId:  human42, brigadeId:  brigade33, startWorkExperience:  '2019-07-01', salary:  18000).save()
        Employee employee34 = new Employee(humanId:  human43, brigadeId:  brigade34, startWorkExperience:  '2021-07-01', salary:  48000).save()
        Employee employee35 = new Employee(humanId:  human44, brigadeId:  brigade35, startWorkExperience:  '2015-02-14', salary:  48000).save()
        Employee employee36 = new Employee(humanId:  human45, brigadeId:  brigade36, startWorkExperience:  '2016-02-01', salary:  90000).save()
        Employee employee37 = new Employee(humanId:  human46, brigadeId:  brigade37, startWorkExperience:  '2018-02-28', salary:  98000).save()
        Employee employee38 = new Employee(humanId:  human47, brigadeId:  brigade38, startWorkExperience:  '2019-10-12', salary:  35000).save()
        Employee employee39 = new Employee(humanId:  human48, brigadeId:  brigade39, startWorkExperience:  '2011-05-21', salary:  36000).save()
        Employee employee40 = new Employee(humanId:  human49, brigadeId:  brigade40, startWorkExperience:  '2015-07-01', salary:  23000).save()
        Employee employee41 = new Employee(humanId:  human50, brigadeId:  brigade41, startWorkExperience:  '2019-11-12', salary:  24000).save()
        Employee employee42 = new Employee(humanId:  human51, brigadeId:  brigade42, startWorkExperience:  '2021-07-07', salary:  15000).save()
        Employee employee43 = new Employee(humanId:  human52, brigadeId:  brigade43, startWorkExperience:  '2020-09-01', salary:  18000).save()
        Employee employee44 = new Employee(humanId:  human53, brigadeId:  brigade44, startWorkExperience:  '2020-08-01', salary:  48000).save()
        Employee employee45 = new Employee(humanId:  human54, brigadeId:  brigade45, startWorkExperience:  '2020-04-01', salary:  48000).save()



         */


/*
        // ticket
        Ticket ticket1 = new Ticket(passengerId: passenger1, flightId: flight1, status: 'продан', isLuggage: true, price: 1001).save()
        Ticket ticket2 = new Ticket(passengerId:  passenger2, flightId:  flight2, status:  'продан',isLuggage:  true, price:  1001).save()
        Ticket ticket3 = new Ticket(passengerId:  passenger3, flightId:  flight3, status:  'продан', isLuggage:  true, price:  1500).save()
        Ticket ticket4 = new Ticket(passengerId:  passenger4, flightId:  flight4, status:  'забронирован', isLuggage:  true, price:  2000).save()
        Ticket ticket5 = new Ticket(passengerId:  passenger5, flightId:  flight5, status:  'продан', isLuggage:  true, price:  3000).save()
        Ticket ticket6 = new Ticket(passengerId:  passenger6, flightId:  flight1, status:  'продан', isLuggage:  true, price:  6000).save()
        Ticket ticket7 = new Ticket(passengerId:  passenger7, flightId:  flight2, status:  'продан', isLuggage:  true, price:  4500).save()
        Ticket ticket8 = new Ticket(passengerId:  passenger8, flightId:  flight3, status:  'забронирован', isLuggage:  true, price:  1450).save()
        Ticket ticket9 = new Ticket(passengerId:  passenger9, flightId:  flight4, status:  'вернут', isLuggage:  true, price:  5678).save()
        Ticket ticket10 = new Ticket(passengerId:  passenger10, flightId:  flight4, status:  'вернут', isLuggage:  true, price:  2020).save()

        // medical examination

        MedicalExamination medicalExamination1 = new MedicalExamination(employee: employee1, medicalExamination: '2021-01-02', isPassed: true ).save()
        MedicalExamination medicalExamination2 = new MedicalExamination(employee:  employee2, medicalExamination:  '2019-08-01', isPassed:  true).save()
        MedicalExamination medicalExamination3 = new MedicalExamination(employee:  employee3, medicalExamination:  '2020-02-05', isPassed:  true).save()
        MedicalExamination medicalExamination4 = new MedicalExamination(employee:  employee4, medicalExamination:  '2021-03-03', isPassed:  true).save()
        MedicalExamination medicalExamination5 = new MedicalExamination(employee:  employee5, medicalExamination:  '2018-02-04', isPassed:  false).save()


        // repair
        Repair repair1 = new Repair(planeId: plane1, startTime: '2004-06-18 12:00:00', endTime: '2004-06-18 16:39:40').save()
        Repair repair2 = new Repair(planeId:  plane2, startTime:  '2010-07-02 07:01:21', endTime:  '2010-07-02 12:30:00').save()
        Repair repair3 = new Repair(planeId:  plane3, startTime:  '2010-01-01 13:59:54', endTime:  '2010-01-01 17:20:13').save()
        Repair repair4 = new Repair(planeId:  plane4, startTime:  '2007-03-29 07:09:32', endTime:  '2007-03-29 13:19:28').save()
        Repair repair5 = new Repair(planeId:  plane5, startTime:  '2011-02-15 14:18:01', endTime:  '2011-02-15 20:03:02').save()
        Repair repair6 = new Repair(planeId:  plane1, startTime:  '2013-05-10 04:37:46', endTime:  '2013-05-10 10:12:12').save()
        Repair repair7 = new Repair(planeId:  plane2, startTime:  '2014-12-16 07:38:00', endTime:  '2014-12-16 11:51:46').save()
        Repair repair8 = new Repair(planeId:  plane3, startTime:  '2012-04-10 07:02:20', endTime:  '2012-04-10 10:31:22').save()
        Repair repair9 = new Repair(planeId:  plane4, startTime:  '2009-02-15 08:53:29', endTime:  '2009-02-15 14:40:33').save()
        Repair repair10 = new Repair(planeId:  plane1, startTime:  '2016-03-17 11:21:16', endTime:  '2016-03-17 13:01:06').save()

        // technical inspection
        TechnicalInspection technicalInspection1 = new TechnicalInspection(planeId: plane1, inspectionTime: '2010-01-13 23:40:40', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection2 = new TechnicalInspection(planeId:  plane2, inspectionTime:  '2010-01-01 01:57:00', isExecutedInspection:  true).save()
        TechnicalInspection technicalInspection3 = new TechnicalInspection(planeId:  plane3, inspectionTime:  '2010-01-30 13:16:29', isExecutedInspection:  true).save()
        TechnicalInspection technicalInspection4 = new TechnicalInspection(planeId:  plane4, inspectionTime:  '2010-02-01 17:41:25', isExecutedInspection: false).save()
        TechnicalInspection technicalInspection5 = new TechnicalInspection(planeId:  plane5, inspectionTime:  '2010-02-01 17:41:25', isExecutedInspection: false).save()
        TechnicalInspection technicalInspection6 = new TechnicalInspection(planeId:  plane5, inspectionTime:  '2010-08-09 20:33:26', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection7 = new TechnicalInspection(planeId:  plane1, inspectionTime:  '2010-12-16 12:54:27', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection8 = new TechnicalInspection(planeId:  plane2, inspectionTime:  '2011-12-16 11:58:05', isExecutedInspection: false).save()
        TechnicalInspection technicalInspection9 = new TechnicalInspection(planeId:  plane3, inspectionTime:  '2011-01-26 13:16:25', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection10 = new TechnicalInspection(planeId:  plane4, inspectionTime:  '2010-12-01 17:30:05', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection11 = new TechnicalInspection(planeId:  plane5, inspectionTime:  '2010-12-09 20:30:20', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection12 = new TechnicalInspection(planeId:  plane5, inspectionTime:  '2011-11-09 20:33:26', isExecutedInspection:  false).save()
        TechnicalInspection technicalInspection13 = new TechnicalInspection(planeId:  plane3, inspectionTime:  '2012-02-09 20:12:23', isExecutedInspection: true).save()
        TechnicalInspection technicalInspection14 = new TechnicalInspection(planeId:  plane3, inspectionTime:  '2012-08-09 20:33:26', isExecutedInspection: false).save()

        // agency
        Agency agency1 = new Agency(flightId: flight1, ticketId: ticket1).save()
        Agency agency2 = new Agency(flightId: flight1, ticketId: ticket2).save()

*/
    }

    def destroy = {
    }
}
