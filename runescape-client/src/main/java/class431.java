import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class431 {
	@ObfuscatedName("ao")
	final Map field4637;
	@ObfuscatedName("ab")
	final Map field4638;
	@ObfuscatedName("au")
	final DecimalFormat field4640;

	public class431() {
		this.field4637 = new HashMap();
		this.field4638 = new HashMap();
		this.field4640 = new DecimalFormat();
		this.field4640.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "514712825"
	)
	public void method7958(HttpsURLConnection var1) {
		Iterator var2 = this.field4637.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "289317846"
	)
	public Map method7953() {
		return this.field4637;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1068565867"
	)
	public void method7954(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4637.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	public void method7955(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4637.remove(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Ljava/lang/String;I)V",
		garbageValue = "-1582767971"
	)
	void method7976(class430 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7948(), var2);
		this.method7954("Authorization", var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "1431"
	)
	public void method7957(String var1) {
		this.method7976(class430.field4634, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1155653800"
	)
	public void method7977(String var1) {
		this.method7976(class430.field4633, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "-85"
	)
	public void method7981(class472 var1) {
		this.field4637.put("Content-Type", var1.method8563());
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public void method7960() {
		this.field4637.remove("Content-Type");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "4"
	)
	public void method7961(class472 var1) {
		this.method7962(var1, 1.0F);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsi;FI)V",
		garbageValue = "-974878647"
	)
	void method7962(class472 var1, float var2) {
		this.field4638.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7963();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1694240959"
	)
	void method7963() {
		this.field4637.remove("Accept");
		if (!this.field4638.isEmpty()) {
			this.field4637.put("Accept", this.method7964());
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1880009483"
	)
	String method7964() {
		ArrayList var1 = new ArrayList(this.field4638.entrySet());
		Collections.sort(var1, new class432(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class472)var4.getKey()).method8563());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field4640.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
