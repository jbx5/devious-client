import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.net.URLEncoder;
@ObfuscatedName("ov")
public class class401 implements class399 {
	@ObfuscatedName("q")
	final Map field4452;

	public class401(Map var1) {
		this.field4452 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)[B", garbageValue = "-59")
	public byte[] vmethod7142() throws UnsupportedEncodingException {
		return this.method7141().getBytes("UTF-8");
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1945880427")
	public String method7141() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field4452.entrySet().iterator();
		while (var2.hasNext()) {
			Map.Entry var3 = ((Map.Entry) (var2.next()));
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
}