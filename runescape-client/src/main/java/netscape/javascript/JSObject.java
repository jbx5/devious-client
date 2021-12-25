






















package netscape.javascript;
import java.applet.Applet;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Iterator;
import java.util.ServiceLoader;



















@SuppressWarnings("deprecation")
public abstract class JSObject {




	protected JSObject() {
	}














	public abstract Object call(String methodName, Object... args) throws JSException;













	public abstract Object eval(String s) throws JSException;












	public abstract Object getMember(String name) throws JSException;













	public abstract void setMember(String name, Object value) throws JSException;











	public abstract void removeMember(String name) throws JSException;












	public abstract Object getSlot(int index) throws JSException;













	public abstract void setSlot(int index, Object value) throws JSException;

















	@Deprecated(since = "9")
	@SuppressWarnings("exports")
	public static JSObject getWindow(Applet applet) throws JSException {
		return ProviderLoader.callGetWindow(applet);
	}

	private static class ProviderLoader {
		private static final JSObjectProvider provider;
		static 
		{
			provider = AccessController.doPrivileged(new PrivilegedAction<JSObjectProvider>() {
				@Override
				public JSObjectProvider run() {
					Iterator<JSObjectProvider> providers = ServiceLoader.loadInstalled(JSObjectProvider.class).iterator();
					if (providers.hasNext()) {
						return providers.next();
					}
					return null;
				}
			});
		}

		private static JSObject callGetWindow(Applet applet) {
			if (provider != null) {
				return provider.getWindow(applet);
			}
			return null;
		}
	}
}