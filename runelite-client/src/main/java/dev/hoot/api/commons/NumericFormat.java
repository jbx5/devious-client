package dev.hoot.api.commons;

public class NumericFormat {
    private static final byte COMMAS = 0x1;
    private static final byte THOUSANDS = 0x40;

    private static final char[] POSTFIXES = new char[] {'K', 'M', 'B', 'T'};
    private static final char HYPHEN = '-';
    private static final char COMMA = ',';
    private static final char ZERO = '0';
    private static final char DOT = '.';

    public static int precision(int precision) {
        return precision << 2;
    }

    public static String apply(long value) {
        return apply(value, THOUSANDS | COMMAS | precision(2));
    }

    public static String apply(long value, int settings) {
        StringBuilder builder = new StringBuilder(32);
        builder.append(value);

        char[] buff = builder.toString().toCharArray();
        boolean commas = (settings & COMMAS) == COMMAS;
        int precision = 0;
        int postfix = 0;

        if (settings >= THOUSANDS) {
            postfix = settings >> 6;
            if (postfix > POSTFIXES.length) {
                postfix = POSTFIXES.length;
            }
        }

        if (settings > COMMAS) {
            precision = settings >> 2 & 0xF;
        }

        builder.setLength(0);

        int negative = 0;
        if (buff[0] == HYPHEN) {
            negative = 1;
        }

        int length = buff.length - negative;
        if (postfix * 3 >= length) {
            postfix = (int) (length * 0.334);
            if (postfix * 3 == length && precision == 0) {
                --postfix;
            }
        }

        int end = length - postfix * 3;
        int start = length % 3;
        if (start == 0) {
            start = 3;
        }

        start += negative;

        if (end > 0 && negative == 1) {
            builder.append(HYPHEN);
        }

        int max = end + negative;
        for (int i = negative; i < max; i++) {
            if (i == start && i + 2 < max && commas) {
                start += 3;
                builder.append(COMMA);
            }

            builder.append(buff[i]);
        }

        if (postfix > 0) {
            if (end == 0) {
                if (negative == 1 && precision > 0) {
                    builder.append(HYPHEN);
                }

                builder.append(ZERO);
            }

            max = precision + end + negative;

            if (max > buff.length) {
                max = buff.length;
            }

            end += negative;

            while (max > end) {
                if (buff[max - 1] != ZERO) {
                    break;
                }
                --max;
            }

            if (max - end != 0) {
                builder.append(DOT);
            }

            for (int i = end; i < max; i++) {
                builder.append(buff[i]);

            }

            builder.append(POSTFIXES[postfix - 1]);
        }

        return builder.toString();
    }
}
