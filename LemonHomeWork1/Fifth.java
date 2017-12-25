public class Fifth{
    public static void main(String[] args){
        float EarthMass=65.5f;
        float g=9.8f;
        float percent=0.17f;
        float k=0.101972f;
        float EarthP=0f;
        float MoonP=0f;
        float MoonMass=0f;
        EarthP+=EarthMass*g;
        MoonP+=EarthP*percent;
        MoonMass+=MoonP*k;
        System.out.println("Масса на луне равна: "+MoonMass);
    }
}