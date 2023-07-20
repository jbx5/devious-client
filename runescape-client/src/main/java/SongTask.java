import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("SongTask")
public abstract class SongTask
{
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("as")
	String field4529;
	@ObfuscatedName("aj")
	@Export("songTaskName")
	String songTaskName;
	@ObfuscatedName("ag")
	boolean field4530;
	@ObfuscatedName("az")
	boolean field4526;

	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public abstract boolean vmethod7676(int var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	public boolean method7668() {
		return this.field4530;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "751419690"
	)
	public boolean method7650() {
		return this.field4526;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-29"
	)
	public String method7651() {
		return "Error in task: " + this.songTaskName + ", Error message: " + this.field4529;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Lpp;",
		garbageValue = "276"
	)
	@Export("getSongTask")
	public SongTask getSongTask() {
		return this.songTask;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "934674418"
	)
	void method7653(String var1) {
		this.field4530 = true;
		this.field4529 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;Lnd;I)V",
		garbageValue = "-1865602506"
	)
	public static void method7667(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		class333.SequenceDefinition_animationsArchive = var1;
		class169.SequenceDefinition_skeletonsArchive = var2;
	}
}
