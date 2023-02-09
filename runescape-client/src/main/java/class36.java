import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class36 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   @Export("reflectionChecks")
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("clientLanguage")
   static Language clientLanguage;
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lcc;"
   )
   @Export("mouseRecorder")
   static MouseRecorder mouseRecorder;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1268850395"
   )
   public static void method694() {
      ByteArrayPool.field4443.clear();
      ByteArrayPool.field4443.add(100);
      ByteArrayPool.field4443.add(5000);
      ByteArrayPool.field4443.add(10000);
      ByteArrayPool.field4443.add(30000);
   }
}
