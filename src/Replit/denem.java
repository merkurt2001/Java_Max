import java.util.Arrays;

public class denem {

	public static void main(String[] args) {
		
        String str = "---abmkl.o-";
        //stringin elemanlar� ile bir char array olu�turuyoruz.
        char[] charArray = str.toCharArray();
        System.out.println("Input string: " + str);
        //char arrayi alfabetik olmayan karakterlere dokunmayacak �ekilde ters �eviriyoruz
        reverse(charArray);
        // arrayi tekrardan string e �eviriyoruz
        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);

    }

    static void reverse(char[] str)
    {
        // char array in en son karakterine gelecek olan s�ralamas�n� r olarak, ilk hanesini de l olarak numaraland�r�yorum
        int r = str.length - 1, l = 0;
        // l yi bir artt�r�p r yi bir azalt�rken l ve r nin char array de hitap etti�i yeri de�i�tiriyorum
        while (l < r) {
            /*alfabede olan bir karakter olup olmad���n� belirliyoruz. E�er alfabede olan bir karakterse
            l ye bak�yorsak l yi 1 artt�r�yoruz, e�er r ye bak�yorsak r yi bir azalt�yoruz */
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;
            // char arrayin hem sonundan hemde ba��ndan alfabetik karakterleri bulduktan sonra yerlerini de�i�tiriyoruz.
            else
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

    static void printUniqueWords(String[] arr){
        int length=arr.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++){
            if(temp[i]!=-1)
                temp[i]=1;
            for(int j=i+1;j<length;j++){
                if(arr[j].equals(arr[i])){
                    temp[i]=-1;
                    temp[j]=-1;
                }
            }
        }
        for (int i = 0; i < length; i++){
            if(temp[i]==1){
                System.out.println(arr[i]);
            }
        }
    }
}