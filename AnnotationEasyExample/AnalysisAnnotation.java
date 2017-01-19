package AnnotationEasyExample;

import java.lang.reflect.Method;

public class AnalysisAnnotation {

	// BetHistoryRe extends GdCommonReDto extends ResponseDto
	// BetHistory extends GdCommonDto extends RequestDto
	//
	// public <T> T getResponseDto(RequestDto requestDto,
	// Class<? extends ResponseDto> responseCls, ResponseDatas responseDatas) {
	// Marshaller jaxbMarshaller = getMarshaller(bean.getClass());
	// return null;
	// }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		try {
			Class rt_class = Class.forName(Utility.class.getName());
			// use reflection in java
			// to get method of the certain class
			Method[] methods = rt_class.getMethods();
			boolean flag = rt_class.isAnnotationPresent(Description.class);

			System.out.println("flag = " + flag);
			Description description = (Description) rt_class.getAnnotation(Description.class);

			System.out.println("description = " + description);
			Method method = methods[0];
			Author author = (Author) method.getAnnotation(Author.class);
			System.out.println("author = " + author);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
