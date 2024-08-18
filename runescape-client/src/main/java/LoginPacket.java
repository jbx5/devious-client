import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("LoginPacket")
public class LoginPacket extends class148 {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static Bounds field1671;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4327881918697384821L
	)
	long field1666;
	@ObfuscatedName("ay")
	String field1668;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	LoginPacket(class151 var1) {
		this.this$0 = var1;
		this.field1666 = -1L;
		this.field1668 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1666 = var1.readLong();
		}

		this.field1668 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3442(this.field1666, this.field1668, 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1820472005"
	)
	public static final void method3325() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1419204840"
	)
	static int method3331(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "578945178"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
