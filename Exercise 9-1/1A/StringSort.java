import java.util.*;

public class StringSort {

public static void main(String[] args) {

String[] values = {"mouse", "dog", "cat", "horse", "cow",

"moose", "tiger", "lion", "elephant", "bird", "hamster",

"guinea pig", "leopard", "aardvark", "hummingbird"};

String temp;

String ans[] = new String[values.length];

for(int i = 0; i<values.length ; ++i)

ans[i] = values[i];

for (int i = 0; i < ans.length; i++) {

for (int j = 0; j < ans.length - 1; j++) {

if (ans[j].compareTo(ans[j + 1]) > 0) {

temp = ans[j];

ans[j] = ans[j + 1];

ans[j + 1] = temp;

}

}

}

for (int i = 0; i < ans.length; i++) {

System.out.println(ans[i]);

}

}

}
