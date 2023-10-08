/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.rlpatch;

import com.google.common.base.Stopwatch;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.execution.Execution;
import net.runelite.deob.Deob;
import net.runelite.deob.Deobfuscator;
import net.runelite.deob.deobfuscators.Order;
import net.runelite.deob.deobfuscators.arithmetic.ModArith;
import net.runelite.deob.deobfuscators.arithmetic.MultiplicationDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyOneDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyZeroDeobfuscator;
import net.runelite.deob.util.JarUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class CleanRuneLitePatch
{
    private static final Logger logger = LoggerFactory.getLogger(Deob.class);
    public static final int OBFUSCATED_NAME_MAX_LEN = 3;
    private static final boolean CHECK_EXEC = false;

    public static void main(String[] args)
    {
        Stopwatch stopwatch = Stopwatch.createStarted();

        ClassGroup group1 = JarUtil.load(new File("./patch3.jar"), false);
        ClassGroup group2 = JarUtil.load(new File("./patch4.jar"), false);

        RemoveNamedAnnotations.run(group1);
        RemoveNamedAnnotations.run(group2);

        new Order().run(group1);
        new Order().run(group2);

        SyncRuneLitePatches.run(group1, group2);

        JarUtil.save(group1, new File("./patch3-clean.jar"));
        JarUtil.save(group2, new File("./patch4-clean.jar"));

        stopwatch.stop();
        logger.info("Done in {}", stopwatch);
    }

    public static boolean isObfuscated(String name)
    {
        if (name.length() <= OBFUSCATED_NAME_MAX_LEN)
        {
            return !name.equals("run") && !name.equals("add");
        }
        return name.startsWith("method")
                || name.startsWith("vmethod")
                || name.startsWith("field")
                || name.startsWith("class")
                || name.startsWith("__");
    }

    private static void runMath(ClassGroup group)
    {
        ModArith mod = new ModArith();
        mod.run(group);

        int last = -1, cur;
        while ((cur = mod.runOnce()) > 0)
        {
            new MultiplicationDeobfuscator().run(group);

            // do not remove 1 * field so that ModArith can detect
            // the change in guessDecreasesConstants()
            new MultiplyOneDeobfuscator(true).run(group);

            new MultiplyZeroDeobfuscator().run(group);

            if (last == cur)
            {
                break;
            }

            last = cur;
        }

        // now that modarith is done, remove field * 1
        new MultiplyOneDeobfuscator(false).run(group);

        mod.annotateEncryption();
    }

    private static void run(ClassGroup group, Deobfuscator deob)
    {
        Stopwatch stopwatch = Stopwatch.createStarted();
        deob.run(group);
        stopwatch.stop();

        logger.info("{} took {}", deob.getClass().getSimpleName(), stopwatch);

        // check code is still correct
        if (CHECK_EXEC)
        {
            Execution execution = new Execution(group);
            execution.populateInitialMethods();
            execution.run();
        }
    }
}