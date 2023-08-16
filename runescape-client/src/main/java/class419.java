import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class419 {
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 183418913
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("at")
	final Map field4599;
	@ObfuscatedName("ac")
	final Map field4600;
	@ObfuscatedName("ai")
	final DecimalFormat field4596;

	public class419() {
		this.field4599 = new HashMap();
		this.field4600 = new HashMap();
		this.field4596 = new DecimalFormat();
		this.field4596.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;B)V",
		garbageValue = "14"
	)
	public void method7715(HttpsURLConnection var1) {
		Iterator var2 = this.field4599.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1187497182"
	)
	public Map method7716() {
		return this.field4599;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2091196892"
	)
	public void method7717(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4599.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-321106609"
	)
	public void method7752(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4599.remove(var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Ljava/lang/String;B)V",
		garbageValue = "19"
	)
	void method7727(class418 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7712(), var2);
		this.method7717("Authorization", var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-67954068"
	)
	public void method7720(String var1) {
		this.method7727(class418.field4593, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-911338485"
	)
	public void method7756(String var1) {
		this.method7727(class418.field4594, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "858846638"
	)
	public void method7726(class460 var1) {
		this.field4599.put("Content-Type", var1.method8321());
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	public void method7723() {
		this.field4599.remove("Content-Type");
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)V",
		garbageValue = "103"
	)
	public void method7724(class460 var1) {
		this.method7736(var1, 1.0F);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lre;FI)V",
		garbageValue = "-2080888931"
	)
	void method7736(class460 var1, float var2) {
		this.field4600.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7731();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-689194447"
	)
	void method7731() {
		this.field4599.remove("Accept");
		if (!this.field4600.isEmpty()) {
			this.field4599.put("Accept", this.method7750());
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "92"
	)
	String method7750() {
		ArrayList var1 = new ArrayList(this.field4600.entrySet());
		Collections.sort(var1, new class420(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class460)var4.getKey()).method8321());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field4596.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
