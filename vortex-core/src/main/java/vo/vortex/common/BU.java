package vo.vortex.common;

/**
 * byte 相关
 *
 * @author zhangzhen
 * @date 2026年11月19日 18:20:23
 */
public final class BU {

	public static boolean isTChar(final byte[] bytes) {
		if (bytes == null) {
			return false;
		}
		return isTChar(bytes, 0, bytes.length);
	}

	public static boolean isTChar(final byte[] bytes, final int offset, final int length) {
		if ((bytes == null) || (offset < 0) || (length < 0) || (offset > (bytes.length - length))) {
			return false;
		}

		final int end = offset + length;
		for (int i = offset; i < end; i++) {
			if (!isTChar(bytes[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean isTChar(final byte b) {
		if ((b >= 'A') && (b <= 'Z')) {
			return true;
		}
		if ((b >= 'a') && (b <= 'z')) {
			return true;
		}
		if ((b >= '0') && (b <= '9')) {
			return true;
		}

		switch (b) {
		case '!':
		case '#':
		case '$':
		case '%':
		case '&':
		case '\'':
		case '*':
		case '+':
		case '-':
		case '.':
		case '^':
		case '_':
		case '`':
		case '|':
		case '~':
			return true;
		default:
			return false;
		}

	}

	private BU() {
	}
}