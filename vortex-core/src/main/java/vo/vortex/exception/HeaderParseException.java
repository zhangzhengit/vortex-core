package vo.vortex.exception;

/**
 * 解析请求异常
 *
 * @author zhangzhen
 * @date 2026年11月20日 19:58:33
 */
public class HeaderParseException extends ZFException {

	private static final long serialVersionUID = 1L;

	public static final String PREFIX = "解析http请求异常：";

	public HeaderParseException(final String message) {
		super(PREFIX + message);
	}

	public HeaderParseException(final String message, final int httpStatus) {
		super(PREFIX + message, httpStatus);
	}

}
