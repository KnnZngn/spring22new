package replit_Response;

public class Ex_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(5+7+"HayyAllah"+ 4+5); //12HayyAllah45 Stringten öncesni toplar sonrasına string muamelsi yapr
        //System.out.println(sb); //12HayyAllah45
        String name= "Ğaffar";
        sb.append(name,2,4);  // name in 2dahil ile 4 arasını al demek  yani Ğaffar ın  ff yi alır sona ekler
        //System.out.println(sb); // 12HayyAllah45ff    ff
        sb.delete(4,6); // 4 dahil 6 hariç arası demektir yani yy yi siler
        System.out.println(sb);  // 12HaAllah45ff   12HayyAllah45 hep değişti çünkü StringBuilder mutable
        System.out.println(name); // Ğaffar hiç değişmedi cünkü String İMMUTABLE

         // sb.subSequence() ile substring() aynı işi yapar StringBuilder da ama ikiside değişiklik yapmaz

    }


}
