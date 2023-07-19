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

@ObfuscatedName("qb")
public class class420 {
	@ObfuscatedName("am")
	final Map field4600;
	@ObfuscatedName("as")
	final Map field4601;
	@ObfuscatedName("aj")
	final DecimalFormat field4602;

	public class420() {
		this.field4600 = new HashMap();
		this.field4601 = new HashMap();
		this.field4602 = new DecimalFormat();
		this.field4602.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;B)V",
		garbageValue = "-29"
	)
	public void method7759(HttpsURLConnection var1) {
		Iterator var2 = this.field4600.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1295921167"
	)
	public Map method7778() {
		return this.field4600;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1082085990"
	)
	public void method7761(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4600.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "70"
	)
	public void method7762(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4600.remove(var1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Ljava/lang/String;I)V",
		garbageValue = "521425039"
	)
	void method7780(class419 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7752(), var2);
		this.method7761("Authorization", var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2096354513"
	)
	public void method7764(String var1) {
		this.method7780(class419.field4596, var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-892969750"
	)
	public void method7765(String var1) {
		this.method7780(class419.field4592, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrs;I)V",
		garbageValue = "-1926129301"
	)
	public void method7766(class461 var1) {
		this.field4600.put("Content-Type", var1.method8386());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1661875858"
	)
	public void method7767() {
		this.field4600.remove("Content-Type");
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrs;B)V",
		garbageValue = "11"
	)
	public void method7768(class461 var1) {
		this.method7769(var1, 1.0F);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrs;FI)V",
		garbageValue = "-1632504604"
	)
	void method7769(class461 var1, float var2) {
		this.field4601.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7792();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	void method7792() {
		this.field4600.remove("Accept");
		if (!this.field4601.isEmpty()) {
			this.field4600.put("Accept", this.method7771());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2113017491"
	)
	String method7771() {
		ArrayList var1 = new ArrayList(this.field4601.entrySet());
		Collections.sort(var1, new class421(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class461)var4.getKey()).method8386());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field4602.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "([Lmt;II)V",
		garbageValue = "658485102"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						ChatChannel.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					GrandExchangeOfferOwnWorldComparator.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = VarbitComposition.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					GrandExchangeOfferOwnWorldComparator.runScriptEvent(var5);
				}
			}
		}

	}
}
