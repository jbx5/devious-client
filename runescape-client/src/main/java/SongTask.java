import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ax")
	String field4574;
	@ObfuscatedName("ao")
	String field4572;
	@ObfuscatedName("ah")
	boolean field4576;
	@ObfuscatedName("ar")
	boolean field4573;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public abstract boolean vmethod7780();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1050307233"
	)
	public boolean method7760() {
		return this.field4576;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	public boolean method7762() {
		return this.field4573;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1522187493"
	)
	public String method7763() {
		return "Error in task: " + this.field4572 + ", Error message: " + this.field4574;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "-1213560262"
	)
	public SongTask method7764() {
		return this.songTask;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "225620137"
	)
	void method7773(String var1) {
		this.field4576 = true;
		this.field4574 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1674491330"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
