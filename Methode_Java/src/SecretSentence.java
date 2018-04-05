

public class SecretSentence
{

    private String sentence;
    private String bestiole;
    private String places;

    public String getPlaces()
    {
        return places;
    }

    public void setPlaces(String places)
    {
        this.places = places;
    }

    public String getBestiole()
    {
        return bestiole;
    }

    public void setBestiole(String bestiole)
    {
        this.bestiole = bestiole;
    }

    public  String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }


    private  String writeSecretSentence(String animals, String place)
    {

        setSentence(animals+ " s'incline face à "+ place);

        return getSentence();
    }



    public static void main(String[] args)
    {

        SecretSentence phrase = new SecretSentence();
        phrase.setBestiole("Poulet");
        phrase.setPlaces("Cochon");
        System.out.println(phrase.writeSecretSentence(phrase.getBestiole(),phrase.getPlaces()));
    }
}




