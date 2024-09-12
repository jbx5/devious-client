import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class53 extends Node {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static Bounds field349;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 408071453
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -1719871271
	)
	static int field353;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	class47 field350;

	public class53() {
		this.field350 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcf;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field350 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbg;)V"
	)
	public class53(RawSound var1) {
		this.field350 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1724018812"
	)
	public boolean method1100() {
		return this.field350 == null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lbg;",
		garbageValue = "1067628177"
	)
	public RawSound method1101() {
		if (this.field350 != null && this.field350.field316.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1108();
			} finally {
				this.field350.field316.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lbg;",
		garbageValue = "1280396132"
	)
	public RawSound method1102() {
		if (this.field350 != null) {
			this.field350.field316.lock();

			RawSound var1;
			try {
				var1 = this.method1108();
			} finally {
				this.field350.field316.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)Lbg;",
		garbageValue = "16981"
	)
	RawSound method1108() {
		if (this.field350.field318 == null) {
			this.field350.field318 = this.field350.field317.toRawSound((int[])null);
			this.field350.field317 = null;
		}

		return this.field350.field318;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Llc;",
		garbageValue = "-775651959"
	)
	static WorldMapSprite method1112(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class106.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Luj;",
		garbageValue = "-44265172"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5356.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9821(new Buffer(var2));
			}

			var1.method9813();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		PcmPlayer.logOut();
		switch(var0) {
		case 1:
			LoginState.updateLoginIndex(24);
			Login.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			LoginState.updateLoginIndex(24);
			Login.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
