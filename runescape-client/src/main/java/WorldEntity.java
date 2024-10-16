import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("WorldEntity")
public class WorldEntity implements Entity {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -250587611
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1642096775
	)
	public int field5031;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lsb;"
	)
	class481[] field5034;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1439610543
	)
	int field5035;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	class482 field5036;
	@ObfuscatedName("ae")
	boolean field5032;

	@ObfuscatedSignature(
		descriptor = "(ILdn;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.plane = 0;
		this.worldEntityCoord = new WorldEntityCoord();
		this.field5034 = new class481[10];
		this.field5035 = 0;
		this.field5036 = new class483();
		this.field5032 = false;
		this.worldView = var2;
		this.field5035 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5034[var3] = new class481();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	@Export("getX")
	public int getX() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-968853557"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.plane;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1334638951"
	)
	@Export("initScenePlane")
	public void initScenePlane() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "818730252"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "327814629"
	)
	public int method9147() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1217058965"
	)
	public int method9148() {
		return Math.max(this.worldView.sizeX, this.worldView.sizeY) * 128;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lkt;",
		garbageValue = "-88"
	)
	public WorldEntityCoord method9149() {
		return this.field5034[0].field5040;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "636015096"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5035; ++var3) {
			this.field5034[var3].field5040.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5036.vmethod9204(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-2009040930"
	)
	public final void method9151(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5034[0].field5040.getX();
			int var5 = var1.getY() - this.field5034[0].field5040.getY();
			this.method9168(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9152(var1);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-262959930"
	)
	public void method9152(WorldEntityCoord var1) {
		this.worldEntityCoord.method5771(var1);
		this.field5034[0].field5040.method5771(var1);
		this.field5035 = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkt;III)V",
		garbageValue = "-52492117"
	)
	void method9168(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5035 < 9) {
			++this.field5035;
		}

		for (int var4 = this.field5035; var4 > 0; --var4) {
			class481 var5 = this.field5034[var4];
			this.field5034[var4] = this.field5034[var4 - 1];
			this.field5034[var4 - 1] = var5;
		}

		this.field5034[0].field5040.method5771(var1);
		this.field5034[0].field5041 = Client.cycle;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "531003044"
	)
	public final void method9154(int var1) {
		if (this.field5035 == 0) {
			this.method9152(this.field5034[0].field5040);
		} else {
			if (!this.field5032) {
				this.field5036.vmethod9203(this.worldEntityCoord, this.field5034[0], var1);
				this.field5032 = true;
			}

			if (this.field5036.vmethod9202(this.worldEntityCoord, var1, this.field5035)) {
				--this.field5035;
				this.field5032 = false;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Lqt;",
		garbageValue = "-1618837110"
	)
	public class426 method9155(int var1, int var2) {
		class422 var3 = new class422();
		TransformationMatrix var4 = class177.method3843();
		var3.field4752.method8234(class337.method6771(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4753.method8200((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.worldView.sizeX * 64 + 64;
		var2 -= this.worldView.sizeY * 64 + 64;
		var4.method8259(var3);
		var3.method8127();
		class426 var5 = var4.method8266((float)var1, 0.0F, (float)var2);
		var4.method8284();
		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)F",
		garbageValue = "1541571974"
	)
	static float method9165(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (float)(var2 - var1);
	}
}
