package home_work_1.branching_operators;

public class BytesToKilobytes {

    public static void main(String[] args) {

        byteToKilobyteConsole(2_999_999_999L);
        kilobyteToByteConsole(3212334);

    }


    /**
     * Метод получает количество байт и возвращает соответствущее количество килобайт
     */
    public static long byteToKilobyte(long bytes) {
        return bytes / 1000;
    }


    /**
     * Метод получает количество килобайт и возвращает соответствущее количество байт
     */
    public static long kilobyteToByte(long kilobytes) {
        return kilobytes * 1000;
    }


    /**
     * Метод получает количество байт, возвращает соответствущее количество килобайт
     * и выводит итог в консоль.
     */
    public static void byteToKilobyteConsole(long bytes) {
        System.out.println("Bytes: " + bytes);
        System.out.println("Kilobytes: " + byteToKilobyte(bytes) + "\n");
    }


    /**
     * Метод получает количество килобайт, возвращает соответствущее количество байт
     * и выводит итог в консоль.
     */
    public static void kilobyteToByteConsole(long kilobytes) {
        System.out.println("Kilobytes: " + kilobytes);
        System.out.println("Bytes: " + kilobyteToByte(kilobytes) + "\n");
    }
}
