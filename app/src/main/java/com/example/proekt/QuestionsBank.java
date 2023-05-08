package com.example.proekt;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> historyQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("Как се наричали водачите на прабългарите?","царе","князе","крале","ханове","ханове","");
        final QuestionsList question2=new QuestionsList("Кое от посочените събития е станало през ІХ век?","Българската църква била призната за патриаршия","Българите победили византийците в битката при Онгъла","Крепостта Сердика била превзета от хан Крум","Хан Кубрат създал Стара Велика България","Крепостта Сердика била превзета от хан Крум","");
        final QuestionsList question3=new QuestionsList("Управлението на кой български владетел се характеризира с териториално разширение, развитие на книжовността, изграждане на нова столица?","Цар Симеон","Хан Омуртаг","Княз Борис","Цар Симеон","Цар Петър","");
        final QuestionsList question4=new QuestionsList("Кое твърдение за управлението на цар Иван Асен ІІ НЕ е вярно?","Започнал да сече златни монети","Разширил територията на държавата на три морета","Постигнал възстановяване на Българската патриаршия","Сключил съюз с Византия срещу Латинската империя","Сключил съюз с Византия срещу Латинската империя","");
        final QuestionsList question5=new QuestionsList("Коя е най-многобройната обществена група в българската държава през Средновековието?","Селяните","Духовенството","Аристокрацията","Занятчиите","Селяните","");
        final QuestionsList question6=new QuestionsList("Кой от книжовниците НЕ е от времето на „Златния век” на цар Симеон?","Климент Охридски","Константин преславски","Черноризец Храбър","Евтимий Търновски","Евтимий Търновски","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> sportsQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("Кой е най-големият стадион в България?","Стадион „Васил Левски“ в София","Стадион „Пловдив“","Стадион „Георги Аспарухов“ в София","Стадион „Лазур“ в Бургас","Стадион „Пловдив“","");
        final QuestionsList question2=new QuestionsList("Кой е единственият спорт, който носи златен медал на България от зимни олимпийски игри?","Хокей на лед","Ски бягане","Шортрек","Биатлон","Биатлон","");
        final QuestionsList question3=new QuestionsList("Кой е спортът, който носи първия златен медал на България от олимпийски игри?","Вдигане на тежести","Баскетбол","Борба","Художествена гимнастика","Борба","");
        final QuestionsList question4=new QuestionsList("Какъв спорт тренира световноизвестният български бас Николай Гяуров в младежките си години?","Вдигане на тежести","Тенис","Борба","Футбол","Футбол","");
        final QuestionsList question5=new QuestionsList("Колко български състезателки на висок скок са достигали гросмайсторската граница от 200 см.?","Една","Три","Шест","Девет","Шест","");
        final QuestionsList question6=new QuestionsList("В кой спорт се е съзтезавал най-възрастният български олимпиец?","Бокс","Конен спорт","Фехтовка","Бобслей","Конен спорт","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> geographyQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("Коя планина е разположена на границата между България, Гърция и Македония?","Славянка","Беласица","Малешевска планина","Огражден","Беласица","");
        final QuestionsList question2=new QuestionsList("Населението на България в настоящо време е?","6 милиона души","5 милиона души","10 милиона души","6.5 милиона души","6.5 милиона души","");
        final QuestionsList question3=new QuestionsList("Коя е най-пълноводата река в България?","Струма","Марица","Арда","Искър","Марица","");
        final QuestionsList question4=new QuestionsList("След София, кой е най-големият град в България?","Русе","Пловдив","Варна","Бургас","Пловдив","");
        final QuestionsList question5=new QuestionsList("Колко планини в България имат височина над 2000 m?","8","9","10","7","8","");
        final QuestionsList question6=new QuestionsList("Коя от наведените държави НЕ граничи с България?","Румъния","Гърция","Хърватия","Северна Македония","Хърватия","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> cultureQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList question1=new QuestionsList("Къде Паисий Хилендарски завършва „История славянобългарска“?","Хилендарският манастир","Зографският манастир","Рилският манастир","Ватопедски манастир","Зографският манастир","");
        final QuestionsList question2=new QuestionsList("Кое е първото българско списание?","Български орел","Дунавски лебед","Любословие","Будущност","Любословие","");
        final QuestionsList question3=new QuestionsList("Къде е открито първото девическо взаимно училище?","Плевен","Враца","Котел","Калофер","Плевен","");
        final QuestionsList question4=new QuestionsList("Къде се създават първите български хорове?","Свищов и Русе","Шумен и Силистра","Лом и Видин","Болград и Одеса","Свищов и Русе","");
        final QuestionsList question5=new QuestionsList("Как се осъществя издаването на Рибния буквар?","С подкрепата на Русия","С помощта на Хайделбергския университет","Със средства на български търговец","Със собствени средства на Петър Берон","Със средства на български търговец","");
        final QuestionsList question6=new QuestionsList("Кое от следните произведения не е написано от Софроний Врачански?","Книга за трите вери","Кириакодромион","Видински сборници","Славяноболгарское детеводство","Славяноболгарское детеводство","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch(selectedTopicName){

            case "История":
                return historyQuestions();
            case "Спорт":
                return sportsQuestions();
            case "География":
                return geographyQuestions();
            default:
                return cultureQuestions();
        }
    }
}
