package io.papermc.generator.rewriter.data.sample.parser.name;

import static io.papermc.generator.rewriter.data.sample.parser.name.one.OneDepthClass.*;

public class RemoteStaticGlobalInnerClassImportType {
    {
        var b = io.papermc.generator.rewriter.data.sample.parser.name.one.OneDepthClass.NonStaticClass.class;
        var c = StaticClass.class;
    }
}
