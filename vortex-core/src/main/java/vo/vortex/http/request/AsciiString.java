package vo.vortex.http.request;

import java.util.Arrays;

/**
 * 大写字母 > 小写字母
 *
 * @author zhangzhen
 * @date 2026年11月19日 14:30:04
 */
public class AsciiString {

	public static final byte[] LETTER_BYTES = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65, 66, 67, 68,
			69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 0, 0, 0, 0, 0, 0,
			97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
			119, 120, 121, 122 };

	public static String toLowerCaseAsciiByte(final byte[] bytes, final int offset, final int length) {

		final byte[] x = Arrays.copyOfRange(bytes, offset, offset  + length);

		for (int i = 0; i < x.length; i++) {
			x[i] = toLowerCaseAsciiByte(x[i]);
		}

		return new String(x);
	}

	public static byte toLowerCaseAsciiByte(final byte b) {
		if ((b >= 'A') && (b <= 'Z')) {
			return (byte) (b + 32);
		}

		return b;
	}


}
