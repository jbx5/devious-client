import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ec")
final class class106 implements class324 {
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1358;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void vmethod6102() {
		if (this.val$cc != null && this.val$cc.method6471().field3553 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2290(this.val$cc);
			var1.setArgs(this.val$cc.method6471().field3553);
			ClientPacket.method5722().addFirst(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static void method2690() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1061757144"
	)
	static float[] method2689(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}
}
