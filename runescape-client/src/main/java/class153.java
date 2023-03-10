import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class153 extends class156 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1470674977
   )
   int field1725;
   @ObfuscatedName("al")
   byte field1721;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1227031987
   )
   int field1722;
   @ObfuscatedName("ab")
   String field1723;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgk;"
   )
   final class157 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgk;)V"
   )
   class153(class157 var1) {
      this.this$0 = var1;
      this.field1725 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2070491057"
   )
   void vmethod3353(Buffer var1) {
      var1.readUnsignedByte();
      this.field1725 = var1.readUnsignedShort();
      this.field1721 = var1.readByte();
      this.field1722 = var1.readUnsignedShort();
      var1.readLong();
      this.field1723 = var1.readStringCp1252NullTerminated();
      var1.readUnsignedByte();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;B)V",
      garbageValue = "-82"
   )
   void vmethod3354(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1725);
      var2.rank = this.field1721;
      var2.world = this.field1722;
      var2.username = new Username(this.field1723);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhp;",
      garbageValue = "-51"
   )
   @Export("getParamDefinition")
   public static ParamComposition getParamDefinition(int var0) {
      ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class368.ParamDefinition_archive.takeFile(11, var0);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
