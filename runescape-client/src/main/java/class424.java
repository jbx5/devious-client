import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public abstract class class424 implements class265 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class463 field4674;

   class424(int var1) {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IS)V",
      garbageValue = "-22677"
   )
   abstract void vmethod8027(Buffer var1, int var2);

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-876693112"
   )
   public void method8016(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         class420[] var3 = new class420[]{class420.field4665, class420.field4666, class420.field4667, class420.field4668};
         class420 var4 = (class420)class4.findEnumerated(var3, var2);
         if (var4 != null) {
            switch (var4.field4669) {
               case 0:
                  int var5 = var1.readUnsignedByte();
                  this.field4674 = class370.method7047(var5);
                  if (this.field4674 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 1:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 2:
                  var1.readStringCp1252NullCircumfixed();
                  break;
               case 3:
                  class4.findEnumerated(class13.method179(), var1.readUnsignedByte());
            }
         } else {
            this.vmethod8027(var1, var2);
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1191366072"
   )
   boolean method8024() {
      return this.field4674 != null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/Object;",
      garbageValue = "39"
   )
   Object method8017() {
      if (this.field4674 == class463.field4897) {
         return 0;
      } else if (this.field4674 == class463.field4898) {
         return -1L;
      } else {
         return this.field4674 == class463.field4903 ? "" : null;
      }
   }
}
