import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("w")
	public static boolean field3289;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1984638055)

	@Export("plane")
	public int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1078309335)

	@Export("x")
	public int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-585894477)

	@Export("y")
	public int y;

	@ObfuscatedSignature(descriptor = 
	"(Lks;)V")

	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == (-1)) {
			this.plane = -1;
		} else {
			this.plane = (var1 >> 28) & 3;
			this.x = (var1 >> 14) & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-78")

	@Export("packed")
	public int packed() {
		return class341.method6280(this.plane, this.x, this.y);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lks;B)Z", garbageValue = 
	"53")

	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)Ljava/lang/String;", garbageValue = 
	"74")

	@Export("toString")
	String toString(String var1) {
		return (((((((this.plane + var1) + (this.x >> 6)) + var1) + (this.y >> 6)) + var1) + (this.x & 63)) + var1) + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord(((Coord) (var1)));
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	static final void method5531() {
		int var0 = class138.menuX;
		int var1 = class1.menuY;
		int var2 = ItemComposition.menuWidth;
		int var3 = ByteArrayPool.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		RouteStrategy.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = ((((Client.menuOptionsCount - 1) - var7) * 15) + var1) + 31;
			int var9 = 16777215;
			if ((((var5 > var0) && (var5 < (var2 + var0))) && (var6 > (var8 - 13))) && (var6 < (var8 + 3))) {
				var9 = 16776960;
			}

			RouteStrategy.fontBold12.draw(AbstractUserComparator.method6736(var7), var0 + 3, var8, var9, 0);
		}

		ScriptEvent.method2092(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight);
	}
}