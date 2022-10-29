import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class69 {
   @ObfuscatedName("h")
   static final BigInteger field874 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("j")
   static final BigInteger field875 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 2113254313
   )
   @Export("selectedItemId")
   static int selectedItemId;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1894701317"
   )
   public static int method2018() {
      return ViewportMouse.ViewportMouse_entityCount;
   }
}
