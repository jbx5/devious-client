import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(descriptor = 
	"Lfx;")

	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("hp")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	920193097)

	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1286565411)

	@Export("type")
	int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-971153847)

	@Export("orientation")
	int orientation;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	326052965)

	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-1315093071)

	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	255854397)

	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lgw;")

	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	896717489)

	@Export("frame")
	int frame;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	131494325)

	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIZLix;)V")

	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != (-1)) {
			this.sequenceDefinition = class163.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (((this.sequenceDefinition.field2161 == 0) && (var9 != null)) && (var9 instanceof DynamicObject)) {
				DynamicObject var10 = ((DynamicObject) (var9));
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && (this.sequenceDefinition.frameCount != (-1))) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.frameIds.length))));
					this.cycleStart -= ((int) (Math.random() * ((double) (this.sequenceDefinition.frameLengths[this.frame]))));
				} else {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.method3844()))));
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if ((var1 > 100) && (this.sequenceDefinition.frameCount > 0)) {
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method3844();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if ((this.frame < 0) || (this.frame > var2)) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label79 : {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length );

						this.frame -= this.sequenceDefinition.frameCount;
					} while ((this.frame >= 0) && (this.frame < this.sequenceDefinition.frameIds.length) );

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = class146.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if ((this.orientation != 1) && (this.orientation != 3)) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = ((var2 + 1) >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = ((var3 + 1) >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = (((var8[var5][var7] + var8[var5][var6]) + var8[var4][var6]) + var8[var4][var7]) >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"57")

	static void method2003() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class4.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = World.method1678();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = WorldMapSectionType.method4312(var1, Login.Login_username);
			}

			switch (var0) {
				case 2 :
					class4.setLoginResponseString(Strings.field3628, Strings.field3870, Strings.field3646);
					Ignored.method6828(6);
					break;
				case 3 :
					class4.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 4 :
					class4.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
					break;
				case 5 :
					class4.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
					break;
				case 6 :
					class4.setLoginResponseString("", "Error connecting to server.", "");
					break;
				case 7 :
					class4.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");}


		}
	}
}