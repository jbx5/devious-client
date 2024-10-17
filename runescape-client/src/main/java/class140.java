import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
class class140 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class145 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	final class136[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfr;II[Lfh;)V"
	)
	class140(class145 var1, int var2, int var3, class136[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIZIIB)J",
		garbageValue = "-44"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "-1684536454"
	)
	static void method3495(PacketBufferNode var0) {
		var0.packetBuffer.writeIntIME(class319.field3306.hash);
		var0.packetBuffer.writeIntLE(class450.archive8.hash);
		var0.packetBuffer.writeInt(Login.archive13.hash);
		var0.packetBuffer.writeIntLE(class142.field1656.hash);
		var0.packetBuffer.writeIntIME(ObjectComposition.soundEffectsArchive.hash);
		var0.packetBuffer.writeInt(class1.archive10.hash);
		var0.packetBuffer.writeInt(MouseHandler.archive6.hash);
	}
}
