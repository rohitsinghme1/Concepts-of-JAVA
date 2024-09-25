class StringBuffers {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Rohit Singh"); // ceating an object of StrigBuffer class and calling its.
        System.out.println(sb.append(" Kumar")); // Adding
        System.out.println(sb.insert(6, "Kumar "));
        System.out.println(sb.delete(18, 23));
        System.out.println(sb.replace(0, 5, "Sachin"));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.substring(0, 6));

    }
}