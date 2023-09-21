import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class434 {
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ax")
	final Map field4642;
	@ObfuscatedName("ao")
	final Map field4643;
	@ObfuscatedName("ah")
	final DecimalFormat field4644;

	public class434() {
		this.field4642 = new HashMap();
		this.field4643 = new HashMap();
		this.field4644 = new DecimalFormat();
		this.field4644.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;B)V",
		garbageValue = "69"
	)
	public void method7861(HttpsURLConnection var1) {
		Iterator var2 = this.field4642.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-1436798954"
	)
	public Map method7898() {
		return this.field4642;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2031585126"
	)
	public void method7893(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4642.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-476420420"
	)
	public void method7864(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4642.remove(var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqf;Ljava/lang/String;B)V",
		garbageValue = "38"
	)
	void method7887(class433 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7857(), var2);
		this.method7893("Authorization", var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "696444770"
	)
	public void method7865(String var1) {
		this.method7887(class433.field4637, var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1668239999"
	)
	public void method7885(String var1) {
		this.method7887(class433.field4636, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;I)V",
		garbageValue = "1867259345"
	)
	public void method7868(class475 var1) {
		this.field4642.put("Content-Type", var1.method8476());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	public void method7869() {
		this.field4642.remove("Content-Type");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lst;I)V",
		garbageValue = "807760846"
	)
	public void method7870(class475 var1) {
		this.method7871(var1, 1.0F);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lst;FI)V",
		garbageValue = "1069776907"
	)
	void method7871(class475 var1, float var2) {
		this.field4643.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7872();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	void method7872() {
		this.field4642.remove("Accept");
		if (!this.field4643.isEmpty()) {
			this.field4642.put("Accept", this.method7873());
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "58"
	)
	String method7873() {
		ArrayList var1 = new ArrayList(this.field4643.entrySet());
		Collections.sort(var1, new class435(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class475)var4.getKey()).method8476());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field4644.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
