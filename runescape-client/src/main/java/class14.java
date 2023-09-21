import java.awt.FontMetrics;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class14 {
	@ObfuscatedName("bk")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("by")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 79874921
	)
	static int field76;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -684920487
	)
	final int field73;
	@ObfuscatedName("al")
	final String field81;
	@ObfuscatedName("ak")
	final ThreadFactory field72;
	@ObfuscatedName("ax")
	final ThreadPoolExecutor field75;

	public class14(String var1, int var2, int var3) {
		this.field81 = var1;
		this.field73 = var2;
		this.field72 = new class16(this);
		this.field75 = this.method179(var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-1100148281"
	)
	final ThreadPoolExecutor method179(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field73), this.field72);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lag;B)Lai;",
		garbageValue = "26"
	)
	public class18 method174(class10 var1) {
		if (this.field75.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field75.getCorePoolSize() + " Queue capacity " + this.field73);
			return new class18("Queue full");
		} else {
			class18 var2 = new class18(this.field75.submit(new class19(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1393067878"
	)
	public final void method175() {
		try {
			this.field75.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lja;",
		garbageValue = "1251737533"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class163.method3363(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-63"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class358.friendsChat != null) {
			PacketBufferNode var1 = ClanChannelMember.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
