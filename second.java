// public class program {
//    public static void main(String[] args) {
//        System.out.print("Введите строку: ");
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();

//        System.out.print(zipStroki(str));

//        in.close();
//    }

//    public static String zipStroki(String str) {
//        StringBuilder result = new StringBuilder();
//        int count = 1;

//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == str.charAt(i+1)) {
//                count += 1;
//                continue;
//             } else {
//                result.append(str.charAt(i));

//                if (count > 1) {
//                    result.append(count);
//                }

//                count = 1;
//            }
//        }

//        result.append(str.charAt(str.length() - 1));

//                if (count > 1) {
//                    result.append(count);
//                }

//        return result.toString();
//    }
// }
