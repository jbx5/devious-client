import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.net.URLEncoder;
@ObfuscatedName("oj")
public class class401 implements class399 {
	@ObfuscatedName("h")
	final Map field4440;

	public class401(Map var1) {
		this.field4440 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)[B", garbageValue = "57")
	public byte[] vmethod7057() throws UnsupportedEncodingException {
		return this.method7058().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "8")
	public String method7058() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field4440.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = ((Entry) (var2.next()));
			String var4 = URLEncoder.encode(((String) (var3.getKey())), "UTF-8");
			String var5 = URLEncoder.encode(((String) (var3.getValue())), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		} 
		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;ZI)[B", garbageValue = "-906139153")
	public static byte[] method7060(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = ((byte[]) ((byte[]) (var0)));
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = ((AbstractByteArrayCopier) (var0));
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
}