package ru.mulashkin.javamm.code.fragment;

import java.util.List;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public interface SourceCode {
    String getModuleName();

    List<String> getLines();
}
