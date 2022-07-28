import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pz")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_plain11")
	public static final FontName FontName_plain11 = new FontName("p11_full");

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_plain12")
	public static final FontName FontName_plain12 = new FontName("p12_full");

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_bold12")
	public static final FontName FontName_bold12 = new FontName("b12_full");

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");

	@ObfuscatedName("nh")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	@ObfuscatedName("z")
	@Export("name")
	String name;

	FontName(String var1) {
		this.name = var1;
	}
}