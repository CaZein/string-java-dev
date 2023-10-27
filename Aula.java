public class Aula {

    public static void main(String[] args) {

        String city = "Piracicaba";
        int size = city.length();
        System.out.println("A cidade de " + city);
        System.out.println("Is the size of " + size + " caracteres");

        String frase = "Minha cidade "
                .concat(city)
                .concat(" é muito linda");
        System.out.println(frase);

        // TABELA DE CARACTERES
        // %s - String
        // %d - Int
        // %f - double ou float


        String student = new String("japa");
        double media = 5.5;
        String messageStudent = String.format("The student %s has an average of %.2f", student, media);
        System.out.println(messageStudent);

        String piracicabaAgeStr = "253";
        int piracicabaAgeInt = Integer.parseInt(piracicabaAgeStr);
        System.out.println(String.format("The age of %s is %d. years", city, piracicabaAgeInt));

        String myName = "Caio";
        int myAge = 17;
        String myAgeStr = Integer.toString(myAge);
        System.out.println(String.format("My name is %s and I am %s years old.", myName, myAgeStr));


        String fullName = "Caio Zein";
        String[] names = fullName.split(" ");
        String initials = "" + names[0].charAt(0) + names[1].charAt(0);
        System.out.println("Initials: " + initials);

        String cityName = "Piracicaba";
        String firstFourChars = cityName.substring(0, 4);
        String lastFourChars = cityName.substring(cityName.length() - 4);
        System.out.println("First four characters: " + firstFourChars);
        System.out.println("Last four characters: " + lastFourChars);


        String phrase = "happy birthday, many wishes and good health";
        String convertedPhrase = phrase.toUpperCase().replace("HAPPY", "HAPPY").replace("WISHES", "WISHES").replace("HEALTH", "HEALTH");
        System.out.println(convertedPhrase);
        
    }

}
