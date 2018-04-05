

public class SecretSentence
{
    private String animals = "Lapin";
    private String place = "Carotte";
    private String sentence;

    public String getAnimals()
    {
        return animals;
    }

    public String getPlace()
    {

        return place;
    }


    public  String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }


    public  String writeSecretSentence(String animals, String place)
    {
        setSentence(getAnimals()+ " s'incline face à "+ getPlace());

        return getSentence();
    }



    public static void main(String[] args)
    {

        SecretSentence phrase = new SecretSentence();
        System.out.println(phrase.writeSecretSentence(phrase.getAnimals(),phrase.getPlace()));
    }
}




