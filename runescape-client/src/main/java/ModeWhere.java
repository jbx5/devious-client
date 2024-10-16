import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4721("", 0, new class403[]{class403.field4686, class403.field4689}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4705("", 1, new class403[]{class403.field4688, class403.field4686, class403.field4689}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4714("", 2, new class403[]{class403.field4688, class403.field4687, class403.field4686}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4707("", 3, new class403[]{class403.field4688}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4710("", 4),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4709("", 5, new class403[]{class403.field4688, class403.field4686}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4708("", 6, new class403[]{class403.field4686}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4711("", 8, new class403[]{class403.field4688, class403.field4686}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4712("", 9, new class403[]{class403.field4688, class403.field4687}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4713("", 10, new class403[]{class403.field4688}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4704("", 11, new class403[]{class403.field4688}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4715("", 12, new class403[]{class403.field4688, class403.field4686}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	field4716("", 13, new class403[]{class403.field4688});

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field4720;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1841475769
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field4706;

	static {
		method7863();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpx;)V"
	)
	ModeWhere(String var3, int var4, class403[] var5) {
		this.field4706 = new HashSet();
		this.id = var4;
		class403[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class403 var8 = var6[var7];
			this.field4706.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4706 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpa;",
		garbageValue = "-1051850"
	)
	static ModeWhere[] method7863() {
		return new ModeWhere[]{field4709, field4710, field4713, field4711, field4716, field4715, field4708, field4705, field4721, field4704, field4714, field4707, field4712};
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-707051104"
	)
	static void method7865() {
		if (Client.isSpellSelected) {
			Widget var0 = class416.widgetDefinition.getWidgetChild(class483.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Ignored.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class110.invalidateWidget(var0);
		}
	}
}
